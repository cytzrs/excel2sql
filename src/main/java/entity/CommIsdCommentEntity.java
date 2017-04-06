package entity;

/**
 * Created by liyangc on 2017/3/16.
 */
public class CommIsdCommentEntity {
    private long commentId;
    private Long orderId;
    private Long vehicleId;
    private String vehicleName;
    private Long storeId;
    private Long parentStoreId;
    private Long vendorId;
    private Integer cityId;
    private String uid;
    private String commentDate;
    private String commentTitle;
    private String commentContent;
    private Double commentScore;
    private Byte commentScoreType;
    private Byte auditStatus;
    private Byte sourceFrom;
    private Boolean isActive;
    private Integer sort;
    private String ctripReply;
    private String ctripReplyDate;
    private Byte statisticStatus;
    private String dataChangeLastTime;
    private Integer goodUsefulCount;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getParentStoreId() {
        return parentStoreId;
    }

    public void setParentStoreId(Long parentStoreId) {
        this.parentStoreId = parentStoreId;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Double getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Double commentScore) {
        this.commentScore = commentScore;
    }

    public Byte getCommentScoreType() {
        return commentScoreType;
    }

    public void setCommentScoreType(Byte commentScoreType) {
        this.commentScoreType = commentScoreType;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Byte getSourceFrom(int i) {
        return sourceFrom;
    }

    public void setSourceFrom(Byte sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCtripReply() {
        return ctripReply;
    }

    public void setCtripReply(String ctripReply) {
        this.ctripReply = ctripReply;
    }

    public String getCtripReplyDate() {
        return ctripReplyDate;
    }

    public void setCtripReplyDate(String ctripReplyDate) {
        this.ctripReplyDate = ctripReplyDate;
    }

    public Byte getStatisticStatus() {
        return statisticStatus;
    }

    public void setStatisticStatus(Byte statisticStatus) {
        this.statisticStatus = statisticStatus;
    }

    public String getDataChangeLastTime() {
        return dataChangeLastTime;
    }

    public void setDataChangeLastTime(String dataChangeLastTime) {
        this.dataChangeLastTime = dataChangeLastTime;
    }

    public Integer getGoodUsefulCount() {
        return goodUsefulCount;
    }

    public void setGoodUsefulCount(Integer goodUsefulCount) {
        this.goodUsefulCount = goodUsefulCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommIsdCommentEntity that = (CommIsdCommentEntity) o;

        if (commentId != that.commentId) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (vehicleId != null ? !vehicleId.equals(that.vehicleId) : that.vehicleId != null) return false;
        if (vehicleName != null ? !vehicleName.equals(that.vehicleName) : that.vehicleName != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (parentStoreId != null ? !parentStoreId.equals(that.parentStoreId) : that.parentStoreId != null)
            return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (commentDate != null ? !commentDate.equals(that.commentDate) : that.commentDate != null) return false;
        if (commentTitle != null ? !commentTitle.equals(that.commentTitle) : that.commentTitle != null) return false;
        if (commentContent != null ? !commentContent.equals(that.commentContent) : that.commentContent != null)
            return false;
        if (commentScore != null ? !commentScore.equals(that.commentScore) : that.commentScore != null) return false;
        if (commentScoreType != null ? !commentScoreType.equals(that.commentScoreType) : that.commentScoreType != null)
            return false;
        if (auditStatus != null ? !auditStatus.equals(that.auditStatus) : that.auditStatus != null) return false;
        if (sourceFrom != null ? !sourceFrom.equals(that.sourceFrom) : that.sourceFrom != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (ctripReply != null ? !ctripReply.equals(that.ctripReply) : that.ctripReply != null) return false;
        if (ctripReplyDate != null ? !ctripReplyDate.equals(that.ctripReplyDate) : that.ctripReplyDate != null)
            return false;
        if (statisticStatus != null ? !statisticStatus.equals(that.statisticStatus) : that.statisticStatus != null)
            return false;
        if (dataChangeLastTime != null ? !dataChangeLastTime.equals(that.dataChangeLastTime) : that.dataChangeLastTime != null)
            return false;
        if (goodUsefulCount != null ? !goodUsefulCount.equals(that.goodUsefulCount) : that.goodUsefulCount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (commentId ^ (commentId >>> 32));
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (vehicleId != null ? vehicleId.hashCode() : 0);
        result = 31 * result + (vehicleName != null ? vehicleName.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (parentStoreId != null ? parentStoreId.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (commentDate != null ? commentDate.hashCode() : 0);
        result = 31 * result + (commentTitle != null ? commentTitle.hashCode() : 0);
        result = 31 * result + (commentContent != null ? commentContent.hashCode() : 0);
        result = 31 * result + (commentScore != null ? commentScore.hashCode() : 0);
        result = 31 * result + (commentScoreType != null ? commentScoreType.hashCode() : 0);
        result = 31 * result + (auditStatus != null ? auditStatus.hashCode() : 0);
        result = 31 * result + (sourceFrom != null ? sourceFrom.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (ctripReply != null ? ctripReply.hashCode() : 0);
        result = 31 * result + (ctripReplyDate != null ? ctripReplyDate.hashCode() : 0);
        result = 31 * result + (statisticStatus != null ? statisticStatus.hashCode() : 0);
        result = 31 * result + (dataChangeLastTime != null ? dataChangeLastTime.hashCode() : 0);
        result = 31 * result + (goodUsefulCount != null ? goodUsefulCount.hashCode() : 0);
        return result;
    }
}
