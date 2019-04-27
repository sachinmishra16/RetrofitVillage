package com.mishra.sachin.retrofit_1.Model;

import java.io.Serializable;

public class FamilyHeadReg implements Serializable {
    int id, family_id, village_id, district_id, block_id, state_id, user_id, role_id, vc_id, camp_id;
    int no_child_upto_5yrs,no_immunization_upto_5yrs,no_child_register_awc_upto_5yrs;
    String head_name,house_no,aadhar_no,contact_no_self, contact_no_others,medical_insurance,insurance_image,
    nearest_eye_hosp,nearest_eye_hosp_remark,know_cataract_can_treated,want_cataract_treatment,how_much_can_pay_cataract_treatment,
    know_after_40_checkup_needed,are_you_mother, eyes_checked_before_cb, eyes_checked_before_cb_remark, eyes_checked_after_cb,
            eyes_checked_after_cb_remark,
    do_child_recieve_supp_nutrition_from_awc, monthly_income;

    public int getCamp_id() {
        return camp_id;
    }

    public void setCamp_id(int camp_id) {
        this.camp_id = camp_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getVc_id() {
        return vc_id;
    }

    public void setVc_id(int vc_id) {
        this.vc_id = vc_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public int getBlock_id() {
        return block_id;
    }

    public void setBlock_id(int block_id) {
        this.block_id = block_id;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public int getVillage_id() {
        return village_id;
    }

    public void setVillage_id(int village_id) {
        this.village_id = village_id;
    }

    public String getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(String monthly_income) {
        this.monthly_income = monthly_income;
    }

    public int getNo_child_upto_5yrs() {
        return no_child_upto_5yrs;
    }

    public void setNo_child_upto_5yrs(int no_child_upto_5yrs) {
        this.no_child_upto_5yrs = no_child_upto_5yrs;
    }

    public int getNo_immunization_upto_5yrs() {
        return no_immunization_upto_5yrs;
    }

    public void setNo_immunization_upto_5yrs(int no_immunization_upto_5yrs) {
        this.no_immunization_upto_5yrs = no_immunization_upto_5yrs;
    }

    public int getNo_child_register_awc_upto_5yrs() {
        return no_child_register_awc_upto_5yrs;
    }

    public void setNo_child_register_awc_upto_5yrs(int no_child_register_awc_upto_5yrs) {
        this.no_child_register_awc_upto_5yrs = no_child_register_awc_upto_5yrs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFamily_id() {
        return family_id;
    }

    public void setFamily_id(int family_id) {
        this.family_id = family_id;
    }

    public String getHead_name() {
        return head_name;
    }

    public void setHead_name(String head_name) {
        this.head_name = head_name;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public String getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(String aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getContact_no_self() {
        return contact_no_self;
    }

    public void setContact_no_self(String contact_no_self) {
        this.contact_no_self = contact_no_self;
    }

    public String getContact_no_others() {
        return contact_no_others;
    }

    public void setContact_no_others(String contact_no_others) {
        this.contact_no_others = contact_no_others;
    }

    public String getMedical_insurance() {
        return medical_insurance;
    }

    public void setMedical_insurance(String medical_insurance) {
        this.medical_insurance = medical_insurance;
    }

    public String getInsurance_image() {
        return insurance_image;
    }

    public void setInsurance_image(String insurance_image) {
        this.insurance_image = insurance_image;
    }

    public String getNearest_eye_hosp() {
        return nearest_eye_hosp;
    }

    public void setNearest_eye_hosp(String nearest_eye_hosp) {
        this.nearest_eye_hosp = nearest_eye_hosp;
    }

    public String getNearest_eye_hosp_remark() {
        return nearest_eye_hosp_remark;
    }

    public void setNearest_eye_hosp_remark(String nearest_eye_hosp_remark) {
        this.nearest_eye_hosp_remark = nearest_eye_hosp_remark;
    }

    public String getKnow_cataract_can_treated() {
        return know_cataract_can_treated;
    }

    public void setKnow_cataract_can_treated(String know_cataract_can_treated) {
        this.know_cataract_can_treated = know_cataract_can_treated;
    }

    public String getWant_cataract_treatment() {
        return want_cataract_treatment;
    }

    public void setWant_cataract_treatment(String want_cataract_treatment) {
        this.want_cataract_treatment = want_cataract_treatment;
    }

    public String getHow_much_can_pay_cataract_treatment() {
        return how_much_can_pay_cataract_treatment;
    }

    public void setHow_much_can_pay_cataract_treatment(String how_much_can_pay_cataract_treatment) {
        this.how_much_can_pay_cataract_treatment = how_much_can_pay_cataract_treatment;
    }

    public String getKnow_after_40_checkup_needed() {
        return know_after_40_checkup_needed;
    }

    public void setKnow_after_40_checkup_needed(String know_after_40_checkup_needed) {
        this.know_after_40_checkup_needed = know_after_40_checkup_needed;
    }

    public String getAre_you_mother() {
        return are_you_mother;
    }

    public void setAre_you_mother(String are_you_mother) {
        this.are_you_mother = are_you_mother;
    }

    public String getEyes_checked_before_cb() {
        return eyes_checked_before_cb;
    }

    public void setEyes_checked_before_cb(String eyes_checked_before_cb) {
        this.eyes_checked_before_cb = eyes_checked_before_cb;
    }

    public String getEyes_checked_before_cb_remark() {
        return eyes_checked_before_cb_remark;
    }

    public void setEyes_checked_before_cb_remark(String eyes_checked_before_cb_remark) {
        this.eyes_checked_before_cb_remark = eyes_checked_before_cb_remark;
    }

    public String getEyes_checked_after_cb() {
        return eyes_checked_after_cb;
    }

    public void setEyes_checked_after_cb(String eyes_checked_after_cb) {
        this.eyes_checked_after_cb = eyes_checked_after_cb;
    }

    public String getEyes_checked_after_cb_remark() {
        return eyes_checked_after_cb_remark;
    }

    public void setEyes_checked_after_cb_remark(String eyes_checked_after_cb_remark) {
        this.eyes_checked_after_cb_remark = eyes_checked_after_cb_remark;
    }

    public String getDo_child_recieve_supp_nutrition_from_awc() {
        return do_child_recieve_supp_nutrition_from_awc;
    }

    public void setDo_child_recieve_supp_nutrition_from_awc(String do_child_recieve_supp_nutrition_from_awc) {
        this.do_child_recieve_supp_nutrition_from_awc = do_child_recieve_supp_nutrition_from_awc;
    }
}
