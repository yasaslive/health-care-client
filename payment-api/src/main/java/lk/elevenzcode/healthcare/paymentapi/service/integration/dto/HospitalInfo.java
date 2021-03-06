package lk.elevenzcode.healthcare.paymentapi.service.integration.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lk.elevenzcode.healthcare.commons.util.JsonUtil;

/**
 * Created by හShaන් සNදීප on 3/21/2020 9:53 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HospitalInfo {
  private Integer id;
  private String name, address, tel;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return JsonUtil.toString(this);
  }
}
