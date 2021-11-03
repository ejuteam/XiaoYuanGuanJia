package com.glut.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

  private String stuMz;
  private String stuXh;
  private String stuXb;
  private String stuZh;
  private String stuMm;
  private String stuSfz;
  private double stuYe;


  public String getStuMz() {
    return stuMz;
  }

  public void setStuMz(String stuMz) {
    this.stuMz = stuMz;
  }


  public String getStuXh() {
    return stuXh;
  }

  public void setStuXh(String stuXh) {
    this.stuXh = stuXh;
  }


  public String getStuXb() {
    return stuXb;
  }

  public void setStuXb(String stuXb) {
    this.stuXb = stuXb;
  }


  public String getStuZh() {
    return stuZh;
  }

  public void setStuZh(String stuZh) {
    this.stuZh = stuZh;
  }


  public String getStuMm() {
    return stuMm;
  }

  public void setStuMm(String stuMm) {
    this.stuMm = stuMm;
  }


  public String getStuSfz() {
    return stuSfz;
  }

  public void setStuSfz(String stuSfz) {
    this.stuSfz = stuSfz;
  }


  public double getStuYe() {
    return stuYe;
  }

  public void setStuYe(double stuYe) {
    this.stuYe = stuYe;
  }

}
