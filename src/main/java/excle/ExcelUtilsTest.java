package excle;

import constant.Constant;
import entity.CommIsdCommentEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyangc on 2017/3/21.
 */
public class ExcelUtilsTest extends ExcelUtils<CommIsdCommentEntity> {
    public ExcelUtilsTest(String excelPath, String outPath) {
        super(excelPath, outPath);
    }

    public static void main(String[] args) {

        ExcelUtilsTest excelUtilsTest = new ExcelUtilsTest(Constant.EXCEL_COMMENT_PATH, Constant.COMMENT_OUT_PATH);
        try {
            excelUtilsTest.doIt();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
