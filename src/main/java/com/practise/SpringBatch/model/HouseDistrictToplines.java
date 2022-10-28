package com.practise.SpringBatch.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class HouseDistrictToplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column( name="cycle")
    private String Cycle;
    @Column( name="branch")
    private String Branch;
    @Column( name="district")
    private String District;
    @Column( name="foreCastDate")
    private String ForeCastDate;
    @Column( name= "expression")
    private String Expression;
    @Column( name= "name_d1")
    private String Name_D1;
    @Column( name="name_d2")
    private String Name_D2;
    @Column( name="name_i1")
    private String Name_I1;
    @Column( name="name_r1")
    private String Name_R1;
    @Column( name="name_r2")
    private String Name_R2;
    @Column( name="name_o1")
    private String Name_O1;
    @Column( name="winner_d1")
    private String Winner_D1;
    @Column(name="p90netpartymargin")
    private Double P90_NetPartyMargin;
    @Column(name="p10netpartymargin")
    private Double P10_NetPartyMargin;

    public HouseDistrictToplines(){
    }

    public HouseDistrictToplines(Integer id, String cycle, String branch, String district, String foreCastDate, String expression, String name_D1, String name_D2, String name_I1, String name_R1, String name_R2, String name_O1, String winner_D1, Double p90_NetPartyMargin, Double p10_NetPartyMargin) {
        this.id = id;
        Cycle = cycle;
        Branch = branch;
        District = district;
        ForeCastDate = foreCastDate;
        Expression = expression;
        Name_D1 = name_D1;
        Name_D2 = name_D2;
        Name_I1 = name_I1;
        Name_R1 = name_R1;
        Name_R2 = name_R2;
        Name_O1 = name_O1;
        Winner_D1 = winner_D1;
        P90_NetPartyMargin = p90_NetPartyMargin;
        P10_NetPartyMargin = p10_NetPartyMargin;
    }

    public Integer getId() {
        return id;
    }

    public String getCycle() {
        return Cycle;
    }

    public String getBranch() {
        return Branch;
    }

    public String getDistrict() {
        return District;
    }

    public String getForeCastDate() {
        return ForeCastDate;
    }

    public String getExpression() {
        return Expression;
    }

    public String getName_D1() {
        return Name_D1;
    }

    public String getName_D2() {
        return Name_D2;
    }

    public String getName_I1() {
        return Name_I1;
    }

    public String getName_R1() {
        return Name_R1;
    }

    public String getName_R2() {
        return Name_R2;
    }

    public String getName_O1() {
        return Name_O1;
    }

    public String getWinner_D1() {
        return Winner_D1;
    }

    public Double getP90_NetPartyMargin() {
        return P90_NetPartyMargin;
    }

    public Double getP10_NetPartyMargin() {
        return P10_NetPartyMargin;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCycle(String cycle) {
        Cycle = cycle;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public void setForeCastDate(String foreCastDate) {
        ForeCastDate = foreCastDate;
    }

    public void setExpression(String expression) {
        Expression = expression;
    }

    public void setName_D1(String name_D1) {
        Name_D1 = name_D1;
    }

    public void setName_D2(String name_D2) {
        Name_D2 = name_D2;
    }

    public void setName_I1(String name_I1) {
        Name_I1 = name_I1;
    }

    public void setName_R1(String name_R1) {
        Name_R1 = name_R1;
    }

    public void setName_R2(String name_R2) {
        Name_R2 = name_R2;
    }

    public void setName_O1(String name_O1) {
        Name_O1 = name_O1;
    }

    public void setWinner_D1(String winner_D1) {
        Winner_D1 = winner_D1;
    }

    public void setP90_NetPartyMargin(Double p90_NetPartyMargin) {
        P90_NetPartyMargin = p90_NetPartyMargin;
    }

    public void setP10_NetPartyMargin(Double p10_NetPartyMargin) {
        P10_NetPartyMargin = p10_NetPartyMargin;
    }

    @Override
    public String toString() {
        return "HouseDistrictToplines{" +
                "id=" + id +
                ", Cycle='" + Cycle + '\'' +
                ", Branch='" + Branch + '\'' +
                ", District='" + District + '\'' +
                ", ForeCastDate=" + ForeCastDate +
                ", Expression='" + Expression + '\'' +
                ", Name_D1='" + Name_D1 + '\'' +
                ", Name_D2='" + Name_D2 + '\'' +
                ", Name_I1='" + Name_I1 + '\'' +
                ", Name_R1='" + Name_R1 + '\'' +
                ", Name_R2='" + Name_R2 + '\'' +
                ", Name_O1='" + Name_O1 + '\'' +
                ", Winner_D1='" + Winner_D1 + '\'' +
                ", P90_NetPartyMargin=" + P90_NetPartyMargin +
                ", P10_NetPartyMargin=" + P10_NetPartyMargin +
                '}';
    }
}
