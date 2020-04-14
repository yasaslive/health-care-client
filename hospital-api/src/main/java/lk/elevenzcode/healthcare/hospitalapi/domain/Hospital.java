package lk.elevenzcode.healthcare.hospitalapi.domain;

import lk.elevenzcode.healthcare.commons.domain.BaseDomain;
import lk.elevenzcode.healthcare.hospitalapi.util.Constant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Hospital.TABLE_NAME)
public class Hospital extends BaseDomain {
  public static final String TABLE_NAME = "hospital";

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "h_id", nullable = false)
  private Integer hospitalId;

  @Column(name = "h_name", length = 100, nullable = false)
  private String hospitalName;

  @Column(name = "h_address", length = 255, nullable = false)
  private String hospitalAddress; 

  @Column(name = "h_email", length = 100, nullable = false)
  private String hospitalEmail; 

  @Column(name = "h_type", length = 100, nullable = false)
  private String hospitalType;

  @Column(name = "h_details", length = 255, nullable = false)
  private String hospitalDetails;

  @Column(name = "h_contact", length = 100, nullable = false)
  private String hospitalContact;

  public Hospital() {
  }

  public Hospital(Integer id, String name, String address, String email, String type, String details, String contact) {
    this.hospitalId = id;
    this.hospitalName = name;
    this.hospitalAddress = address;
    this.hospitalEmail = email;
    this.hospitalType = type;
    this.hospitalDetails = details;
    this.hospitalContact = contact;
  }

}