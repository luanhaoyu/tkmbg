package oracle.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TEST_BAK")
public class TestBak {
    @Id
    @Column(name = "B_NAME")
    @SequenceGenerator(name="",sequenceName="T_ZZFW_YYFA_BJ_SEQUENCE")
    private Integer bName;

    @Column(name = "B_DESC")
    private String bDesc;

    @Column(name = "B_DATE")
    private Date bDate;

    /**
     * @return B_NAME
     */
    public Integer getbName() {
        return bName;
    }

    /**
     * @param bName
     */
    public void setbName(Integer bName) {
        this.bName = bName;
    }

    /**
     * @return B_DESC
     */
    public String getbDesc() {
        return bDesc;
    }

    /**
     * @param bDesc
     */
    public void setbDesc(String bDesc) {
        this.bDesc = bDesc;
    }

    /**
     * @return B_DATE
     */
    public Date getbDate() {
        return bDate;
    }

    /**
     * @param bDate
     */
    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }
}