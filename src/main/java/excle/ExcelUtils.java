package excle;

import constant.Constant;
import jxl.Sheet;
import jxl.Workbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyangc on 2017/3/21.
 */
public class ExcelUtils<T> {

    private final String excelPath;
    private final String outPath;
    private Class<T> entityClass;

    public ExcelUtils(String excelPath, String outPath) {
        this.excelPath = excelPath;
        this.outPath = outPath;
        initEntityClass();
    }

    private Class<T> getEntityClassInstance() {
        return entityClass;
    }

    private void initEntityClass() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        this.entityClass = (Class) params[0];
    }

    public void doIt() throws IllegalAccessException {
        List<T> listExcel = getAllByExcel(this.excelPath);
        try {
            String path = this.outPath;
            File file = new File(path);
            BufferedWriter ow = new BufferedWriter(new FileWriter(file));
            for (T c : listExcel) {
                String sql = "insert into " + Constant.DB_NAME + " values (" + outSql(c)
                        + ")";
                ow.write(sql + ";" + "\n");
            }
            ow.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> getAllByExcel(String file) {
        List<T> list = new ArrayList<T>();
        try {
            Workbook rwb = Workbook.getWorkbook(new File(file));
            Sheet rs = rwb.getSheet(0);
            int clos = rs.getColumns();
            int rows = rs.getRows();
            for (int i = 1; i < rows; i++) {
                List<String> listString = new ArrayList<String>();
                for (int j = 0; j < clos; j++) {
                    String str = rs.getCell(j, i).getContents();
                    if(str.contains("\"")) {
                        str = str.replace("\"", "'");
                    }
                    listString.add(str);
                }
                T object = (T) newObject(getEntityClassInstance().newInstance(), listString);
                list.add(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Object newObject(T obj, List<String> list)
            throws IllegalArgumentException, IllegalAccessException, SQLException {
        Field[] field = obj.getClass().getDeclaredFields();
        int offset = 0;
        int index = 0;
        for (int i = 0; i < field.length; i++) {
            Field f = field[i];
            String fieldName = f.getName();

            f.setAccessible(true);
            if("cityId".equals(fieldName)) {
                continue;
            }
            if(!checkField(fieldName)){
                offset--;
                continue;
            }
            index = i + offset;

            if (f.getType() == String.class) {
                f.set(obj, list.get(index));
            }
            if (f.getType() == Integer.class) {
                f.set(obj, Integer.parseInt(list.get(index)));
            }
            if (f.getType() == int.class) {
                f.set(obj, Integer.parseInt(list.get(index)));
            }
            if (f.getType() == Long.class) {
                f.set(obj, Long.parseLong(list.get(index)));
            }
            if (f.getType() == long.class) {
                f.set(obj, Long.parseLong(list.get(index)));
            }
            if(f.getType() == Timestamp.class) {
                f.set(obj, Timestamp.valueOf(list.get(index)));
            }
        }
        return obj;
    }

    public String outSql(Object obj) throws IllegalArgumentException,
            IllegalAccessException {
        StringBuffer buffer = new StringBuffer();
        Field[] field = obj.getClass().getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            Field f = field[i];
            f.setAccessible(true);
            if (f.getType() == String.class) {
                buffer.append('"');
            }
            buffer.append(f.get(obj));
            if (f.getType() == String.class) {
                buffer.append('"');
            }
            if (i < field.length - 1) {
                buffer.append(",");
            }
        }
        return buffer.toString();
    }

    public static boolean checkField(String fieldName) {
        for(String temp: Constant.AVAILABLE_FIELDS) {
            if(fieldName.equals(temp)) {
                return true;
            }
        }
        return false;
    }
}
