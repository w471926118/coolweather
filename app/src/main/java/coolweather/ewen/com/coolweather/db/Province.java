package coolweather.ewen.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ewen on 2017/4/15.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int provinceCode;

}
