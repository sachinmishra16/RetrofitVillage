package com.mishra.sachin.retrofit_1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.mishra.sachin.retrofit_1.Model.Block;
import com.mishra.sachin.retrofit_1.Model.FamilyHeadReg;
import com.mishra.sachin.retrofit_1.Model.Treatment;
import com.mishra.sachin.retrofit_1.Model.Village;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Query;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    SSLN_API apiService = ApiClient.getClient().create(SSLN_API.class);  //to make a connenction

    String data="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textid);
        new GetData().execute();

    }

    public class GetData extends AsyncTask<Void,Void,Boolean>
    {

        @Override
        protected Boolean doInBackground(Void... voids)
        {

            Call<ArrayList<Block>> blockcall=apiService.getBlock("block");
            Call<ArrayList<Treatment>> treatmentcall=apiService.getTreatments("treatment");
            Call<ArrayList<Village>> villagecall=apiService.getVillageForCamp("village");
            Call<ArrayList<FamilyHeadReg>> familycall=apiService.getFamilyReg("family_head_reg","2","1");


            try
            {
                ArrayList<Treatment> treatmentArrayList= treatmentcall.execute().body();

                for(Treatment treatment:treatmentArrayList)
                {
                    data=data+"\t"+ "Treatment Name : "+treatment.getTreatment_name()+"\n"+"\n";

                    //Toast.makeText(MainActivity.this, "hihi "+model.getVillageName(), Toast.LENGTH_SHORT).show();
                }



            } catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                ArrayList<Village> villageArrayList= villagecall.execute().body();

                for(Village village:villageArrayList)
                {
                    data=data+"\t"+ "Village Name : "+village.getVillage_name()+"\n"+"\n";

                    //Toast.makeText(MainActivity.this, "hihi "+model.getVillageName(), Toast.LENGTH_SHORT).show();
                }



            } catch (IOException e)
            {
                e.printStackTrace();
            }



            try
            {
                ArrayList<FamilyHeadReg> familyHeadRegArrayList= familycall.execute().body();

                for(FamilyHeadReg familyHeadReg:familyHeadRegArrayList)
                {
                    data=data+"\t"+ "Family Head Name : "+familyHeadReg.getHead_name()+"\n"+"\n";

                    //Toast.makeText(MainActivity.this, "hihi "+model.getVillageName(), Toast.LENGTH_SHORT).show();
                }

                ArrayList<Block> blocks= blockcall.execute().body();

                for(Block block:blocks)
                {
                    data=data+"\t"+ "Block Name : "+block.getBlock_name()+"\n"+"\n";

                    //Toast.makeText(MainActivity.this, "hihi "+model.getVillageName(), Toast.LENGTH_SHORT).show();
                }





            } catch (IOException e)
            {
                e.printStackTrace();
            }


            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {


            super.onPostExecute(aBoolean);

            textView.setText(data);
        }
    }

    }

