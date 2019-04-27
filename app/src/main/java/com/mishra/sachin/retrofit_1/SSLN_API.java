package com.mishra.sachin.retrofit_1;

import android.graphics.ColorSpace;

import com.mishra.sachin.retrofit_1.Model.Block;
import com.mishra.sachin.retrofit_1.Model.FamilyHeadReg;
import com.mishra.sachin.retrofit_1.Model.FamilyMemberReg;
import com.mishra.sachin.retrofit_1.Model.Treatment;
import com.mishra.sachin.retrofit_1.Model.Village;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface SSLN_API
{


    @POST("download_general.php")
    Call<ArrayList<Block>> getBlock(@Query("table_name") String tableName);





    @POST("download_general.php")
    Call<ArrayList<FamilyHeadReg>> getFamilyReg(@Query("table_name") String tableName, @Query("user_id") String user_id, @Query("role_id") String role_id);

    @POST("download_general.php")
    Call<ArrayList<Village>> getVillageForCamp(@Query("table_name") String tableName);

    @POST("download_general.php")
    Call<ArrayList<Treatment>> getTreatments(@Query("table_name") String tableName);



}
