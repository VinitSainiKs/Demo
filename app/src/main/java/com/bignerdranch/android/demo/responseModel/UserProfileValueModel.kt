package com.bignerdranch.android.demo.responseModel


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "user_profile")
data class UserProfileValueModel(

    @ColumnInfo(name = "Category")
    @SerializedName("Category")
    val category: String,

    @ColumnInfo(name = "CategoryText")
    @SerializedName("CategoryText")
    val categoryText: String,

    @ColumnInfo(name = "emailaddress")
    @SerializedName("emailaddress")
    val emailaddress: String,

    @ColumnInfo(name = "entityimage")
    @SerializedName("entityimage")
    val entityimage: String,

    @ColumnInfo(name = "entityimage_timestamp")
    @SerializedName("entityimage_timestamp")
    val entityimageTimestamp: Int,

    @ColumnInfo(name = "new_rationcardcategory")
    @SerializedName("new_rationcardcategory")
    val newRationcardcategory: String,

    @ColumnInfo(name = "new_rationcardcategoryVal")
    @SerializedName("new_rationcardcategoryVal")
    val newRationcardcategoryVal: String,

    @ColumnInfo(name = "_sis_class")
    @SerializedName("_sis_class")
    val sisClass: String,

    @ColumnInfo(name = "_sis_class_value")
    @SerializedName("_sis_class_value")
    val sisClassValue: String,

    @ColumnInfo(name = "_sis_currentclasssession")
    @SerializedName("_sis_currentclasssession")
    val sisCurrentclasssession: String,

    @ColumnInfo(name = "_sis_currentclasssession_value")
    @SerializedName("_sis_currentclasssession_value")
    val sisCurrentclasssessionValue: String,

    @ColumnInfo(name = "sis_dateofadmission")
    @SerializedName("sis_dateofadmission")
    val sisDateofadmission: String,

    @ColumnInfo(name = "sis_dateofbirth")
    @SerializedName("sis_dateofbirth")
    val sisDateofbirth: String,

    @ColumnInfo(name = "sis_fathername")
    @SerializedName("sis_fathername")
    val sisFathername: String,

    @ColumnInfo(name = "sis_mothername")
    @SerializedName("sis_mothername")
    val sisMotherName: String,

    @ColumnInfo(name = "sis_gender")
    @SerializedName("sis_gender")
    val sisGender: Int,

    @ColumnInfo(name = "sis_name")
    @SerializedName("sis_name")
    val sisName: String,

    @ColumnInfo(name = "sis_primarymobilenumber")
    @SerializedName("sis_primarymobilenumber")
    val sisPrimarymobilenumber: String,

    @ColumnInfo(name = "_sis_registration")
    @SerializedName("_sis_registration")
    val sisRegistration: String,

    @ColumnInfo(name = "_sis_registration_value")
    @SerializedName("_sis_registration_value")
    val sisRegistrationValue: String,

    @ColumnInfo(name = "_sis_section_value")
    @SerializedName("_sis_section_value")
    val sisSectionValue: String,

    @PrimaryKey @ColumnInfo(name = "sis_studentid")
    @SerializedName("sis_studentid")
    val sisStudentid: String,

    @ColumnInfo(name = "_sis_studentname_value")
    @SerializedName("_sis_studentname_value")
    val sisStudentnameValue: String,

    @ColumnInfo(name = "sis_studentstatus")
    @SerializedName("sis_studentstatus")
    val sisStudentstatus: Int
)