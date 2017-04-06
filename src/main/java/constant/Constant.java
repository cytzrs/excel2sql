package constant;

/**
 * Created by liyangc on 2017/3/21.
 */
public class Constant {

    public final static String EXCEL_COMMENT_PATH = "/home/cytzrs/Desktop/github/excel2sql/src/main/resources/excel/comment.xls";
    //public final static String EXCEL_STORE_PATH = "";
    public final static String COMMENT_OUT_PATH = "/home/cytzrs/Desktop/github/excel2sql/src/main/resources/excel/comment_out.sql";
    public final static String STORE_OUT_PATH = "/home/cytzrs/Desktop/github/excel2sql/src/main/resources/excel/score_out.sql";
    public final static int COMMENT_START = 130000;
    public final static int SCORE_START = 370000;

    //public final static String SQL_TEMPLATE = "insert into comm_isd_comment values (";
    public final static String[] AVAILABLE_FIELDS = {"commentId","vehicleId","vehicleName","storeId",
            "uid","commentDate","commentContent","commentScore","commentScoreType"};

    public final static String DB_NAME = "comm_isd_comment";
}
