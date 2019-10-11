package com.bignerdranch.android.demo.responseModel


import com.google.gson.annotations.SerializedName

data class SisCurrentclasssession(
    @SerializedName("_createdby_value")
    val createdbyValue: Any,
    @SerializedName("createdon")
    val createdon: Any,
    @SerializedName("_createdonbehalfby_value")
    val createdonbehalfbyValue: Any,
    @SerializedName("importsequencenumber")
    val importsequencenumber: Any,
    @SerializedName("_modifiedby_value")
    val modifiedbyValue: Any,
    @SerializedName("modifiedon")
    val modifiedon: Any,
    @SerializedName("_modifiedonbehalfby_value")
    val modifiedonbehalfbyValue: Any,
    @SerializedName("new_createsection")
    val newCreatesection: Boolean,
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
    @SerializedName("_sis_boardmedium_value")
    val sisBoardmediumValue: Any,
    @SerializedName("_sis_class_value")
    val sisClassValue: Any,
    @SerializedName("sis_classcode")
    val sisClasscode: Any,
    @SerializedName("_sis_classteacher_value")
    val sisClassteacherValue: Any,
    @SerializedName("sis_enddate")
    val sisEnddate: Any,
    @SerializedName("sis_firsthalflec")
    val sisFirsthalflec: Any,
    @SerializedName("sis_fixedsection")
    val sisFixedsection: Boolean,
    @SerializedName("sis_labduration")
    val sisLabduration: Any,
    @SerializedName("sis_lecduration")
    val sisLecduration: Any,
    @SerializedName("sis_lecinaday")
    val sisLecinaday: Any,
    @SerializedName("sis_lunchlecture")
    val sisLunchlecture: Any,
    @SerializedName("sis_marksheetpublish")
    val sisMarksheetpublish: Any,
    @SerializedName("sis_marksheetreleased")
    val sisMarksheetreleased: Boolean,
    @SerializedName("sis_maxnoofstudentinasection")
    val sisMaxnoofstudentinasection: Any,
    @SerializedName("sis_minnoofstudentinasection")
    val sisMinnoofstudentinasection: Any,
    @SerializedName("sis_name")
    val sisName: String,
    @SerializedName("sis_noofsection")
    val sisNoofsection: Any,
    @SerializedName("sis_secondhalflec")
    val sisSecondhalflec: Any,
    @SerializedName("_sis_session_value")
    val sisSessionValue: Any,
    @SerializedName("sis_sessionid")
    val sisSessionid: Any,
    @SerializedName("sis_startdate")
    val sisStartdate: Any,
    @SerializedName("_sis_stream_value")
    val sisStreamValue: Any,
    @SerializedName("sis_studentdistribution")
    val sisStudentdistribution: Int,
    @SerializedName("sis_totalnoofstudents")
    val sisTotalnoofstudents: Int,
    @SerializedName("_stageid_value")
    val stageidValue: Any,
    @SerializedName("statecode")
    val statecode: Int,
    @SerializedName("statuscode")
    val statuscode: Int,
    @SerializedName("timezoneruleversionnumber")
    val timezoneruleversionnumber: Int,
    @SerializedName("traversedpath")
    val traversedpath: Any,
    @SerializedName("utcconversiontimezonecode")
    val utcconversiontimezonecode: Any,
    @SerializedName("versionnumber")
    val versionnumber: Int
)