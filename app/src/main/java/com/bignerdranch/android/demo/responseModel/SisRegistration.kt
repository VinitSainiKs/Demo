package com.bignerdranch.android.demo.responseModel


import com.google.gson.annotations.SerializedName

data class SisRegistration(
    @SerializedName("_createdby_value")
    val createdbyValue: Any,
    @SerializedName("createdon")
    val createdon: Any,
    @SerializedName("_createdonbehalfby_value")
    val createdonbehalfbyValue: Any,
    @SerializedName("emailaddress")
    val emailaddress: Any,
    @SerializedName("entityimage")
    val entityimage: Any,
    @SerializedName("entityimage_timestamp")
    val entityimageTimestamp: Any,
    @SerializedName("entityimage_url")
    val entityimageUrl: Any,
    @SerializedName("entityimageid")
    val entityimageid: Any,
    @SerializedName("exchangerate")
    val exchangerate: Int,
    @SerializedName("importsequencenumber")
    val importsequencenumber: Any,
    @SerializedName("_modifiedby_value")
    val modifiedbyValue: Any,
    @SerializedName("modifiedon")
    val modifiedon: Any,
    @SerializedName("_modifiedonbehalfby_value")
    val modifiedonbehalfbyValue: Any,
    @SerializedName("new_admissionfee")
    val newAdmissionfee: Any,
    @SerializedName("new_admissionfee_base")
    val newAdmissionfeeBase: Any,
    @SerializedName("new_idtype")
    val newIdtype: Any,
    @SerializedName("new_modeofpayment")
    val newModeofpayment: Int,
    @SerializedName("new_optionset")
    val newOptionset: Any,
    @SerializedName("new_optionsetval")
    val newOptionsetval: Any,
    @SerializedName("new_paymentstatus")
    val newPaymentstatus: Boolean,
    @SerializedName("new_per")
    val newPer: Any,
    @SerializedName("new_registrationfee")
    val newRegistrationfee: Int,
    @SerializedName("new_registrationfee_base")
    val newRegistrationfeeBase: Int,
    @SerializedName("_new_school_value")
    val newSchoolValue: Any,
    @SerializedName("new_website")
    val newWebsite: Any,
    @SerializedName("overriddencreatedon")
    val overriddencreatedon: Any,
    @SerializedName("_ownerid_value")
    val owneridValue: Any,
    @SerializedName("_owningbusinessunit_value")
    val owningbusinessunitValue: Any,
    @SerializedName("_owningteam_value")
    val owningteamValue: Any,
    @SerializedName("_owninguser_value")
    val owninguserValue: Any,
    @SerializedName("processid")
    val processid: Any,
    @SerializedName("sis_academic")
    val sisAcademic: Boolean,
    @SerializedName("sis_adharcardnumber")
    val sisAdharcardnumber: Any,
    @SerializedName("sis_ageason1stapril")
    val sisAgeason1stapril: Any,
    @SerializedName("sis_aidsorhiv")
    val sisAidsorhiv: Boolean,
    @SerializedName("sis_aidstext")
    val sisAidstext: Any,
    @SerializedName("sis_allergy")
    val sisAllergy: Boolean,
    @SerializedName("sis_allergytext")
    val sisAllergytext: Any,
    @SerializedName("sis_applicantfullname")
    val sisApplicantfullname: Any,
    @SerializedName("sis_applingfor")
    val sisApplingfor: Any,
    @SerializedName("sis_applyingfor")
    val sisApplyingfor: Int,
    @SerializedName("sis_areyouanexstudentofdps")
    val sisAreyouanexstudentofdps: Boolean,
    @SerializedName("sis_asthma")
    val sisAsthma: Boolean,
    @SerializedName("sis_asthmatext")
    val sisAsthmatext: Any,
    @SerializedName("sis_bloodgroup")
    val sisBloodgroup: Int,
    @SerializedName("sis_category")
    val sisCategory: Int,
    @SerializedName("sis_channel")
    val sisChannel: Int,
    @SerializedName("_sis_class_value")
    val sisClassValue: Any,
    @SerializedName("sis_congenitalorinheriteddisorder")
    val sisCongenitalorinheriteddisorder: Boolean,
    @SerializedName("sis_congenitaltext")
    val sisCongenitaltext: Any,
    @SerializedName("sis_createapplicant")
    val sisCreateapplicant: Boolean,
    @SerializedName("sis_cultural")
    val sisCultural: Boolean,
    @SerializedName("sis_dateofbirth")
    val sisDateofbirth: Any,
    @SerializedName("sis_dateofbirthinwords")
    val sisDateofbirthinwords: Any,
    @SerializedName("sis_days")
    val sisDays: Int,
    @SerializedName("_sis_designation_value")
    val sisDesignationValue: Any,
    @SerializedName("sis_drugaddiction")
    val sisDrugaddiction: Boolean,
    @SerializedName("sis_drugtext")
    val sisDrugtext: Any,
    @SerializedName("sis_expectedsalary")
    val sisExpectedsalary: Any,
    @SerializedName("sis_fathersname")
    val sisFathersname: Any,
    @SerializedName("sis_firstname")
    val sisFirstname: Any,
    @SerializedName("sis_fitstrokeotherneurologicaldisease")
    val sisFitstrokeotherneurologicaldisease: Boolean,
    @SerializedName("sis_fittext")
    val sisFittext: Any,
    @SerializedName("sis_gender")
    val sisGender: Int,
    @SerializedName("_sis_group_value")
    val sisGroupValue: Any,
    @SerializedName("sis_heartorvasculardisease")
    val sisHeartorvasculardisease: Boolean,
    @SerializedName("sis_hearttext")
    val sisHearttext: Any,
    @SerializedName("_sis_job_value")
    val sisJobValue: Any,
    @SerializedName("sis_lastname")
    val sisLastname: Any,
    @SerializedName("sis_maritalstatus")
    val sisMaritalstatus: Any,
    @SerializedName("sis_media")
    val sisMedia: Boolean,
    @SerializedName("sis_medical")
    val sisMedical: Boolean,
    @SerializedName("sis_mentaliiiness")
    val sisMentaliiiness: Boolean,
    @SerializedName("sis_mentaltext")
    val sisMentaltext: Any,
    @SerializedName("sis_middlename")
    val sisMiddlename: Any,
    @SerializedName("sis_months")
    val sisMonths: Int,
    @SerializedName("sis_mothersname")
    val sisMothersname: Any,
    @SerializedName("sis_mothertongue")
    val sisMothertongue: Any,
    @SerializedName("sis_name")
    val sisName: String,
    @SerializedName("sis_nameofschool")
    val sisNameofschool: Any,
    @SerializedName("sis_namingorder")
    val sisNamingorder: Int,
    @SerializedName("_sis_nationality_value")
    val sisNationalityValue: Any,
    @SerializedName("sis_natureofjob")
    val sisNatureofjob: Int,
    @SerializedName("_sis_pasingyear_value")
    val sisPasingyearValue: Any,
    @SerializedName("sis_password")
    val sisPassword: Any,
    @SerializedName("sis_photoattached")
    val sisPhotoattached: Boolean,
    @SerializedName("sis_place")
    val sisPlace: Any,
    @SerializedName("sis_presentsalary")
    val sisPresentsalary: Any,
    @SerializedName("sis_primarymobileno")
    val sisPrimarymobileno: Any,
    @SerializedName("sis_professional")
    val sisProfessional: Boolean,
    @SerializedName("sis_registrationid")
    val sisRegistrationid: Any,
    @SerializedName("_sis_school_value")
    val sisSchoolValue: Any,
    @SerializedName("sis_secondaryemailaddress")
    val sisSecondaryemailaddress: Any,
    @SerializedName("sis_secondarymobileno")
    val sisSecondarymobileno: Any,
    @SerializedName("sis_sports")
    val sisSports: Boolean,
    @SerializedName("sis_sssmid")
    val sisSssmid: Any,
    @SerializedName("sis_transport")
    val sisTransport: Boolean,
    @SerializedName("sis_tuberculosis")
    val sisTuberculosis: Any,
    @SerializedName("sis_tuberculosiss")
    val sisTuberculosiss: Boolean,
    @SerializedName("sis_updatetable")
    val sisUpdatetable: Any,
    @SerializedName("sis_usersalutation")
    val sisUsersalutation: Int,
    @SerializedName("sis_year")
    val sisYear: Int,
    @SerializedName("_stageid_value")
    val stageidValue: Any,
    @SerializedName("statecode")
    val statecode: Int,
    @SerializedName("statuscode")
    val statuscode: Int,
    @SerializedName("timezoneruleversionnumber")
    val timezoneruleversionnumber: Int,
    @SerializedName("_transactioncurrencyid_value")
    val transactioncurrencyidValue: Any,
    @SerializedName("traversedpath")
    val traversedpath: Any,
    @SerializedName("utcconversiontimezonecode")
    val utcconversiontimezonecode: Any,
    @SerializedName("versionnumber")
    val versionnumber: Int
)