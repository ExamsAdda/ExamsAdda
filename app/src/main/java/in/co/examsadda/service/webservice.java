package in.co.examsadda.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by medginiIT on 8/14/2017.
 */

public class webservice extends AsyncTask<String,Void,String> {
    ProgressDialog pd;
    Context context;
    String domain="";
    String show="";
    String data1="";
    private onAsyncTaskCompleteListener listener=null;

    public webservice(Context mContext, onAsyncTaskCompleteListener listener1, String domain, String show, String data){
        this.context=mContext;
        this.listener=listener1;
        this.domain=domain;
        this.show=show;
        this.data1=data;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if(show.equalsIgnoreCase("yes")){
            pd = new ProgressDialog(context);
            pd.setMessage("Please Wait...");
            pd.setCancelable(false);
            pd.show();
        }


    }

    @Override
    protected String doInBackground(String... params) {

        /*String data = "";

        HttpURLConnection httpURLConnection = null;
        try {

            httpURLConnection = (HttpURLConnection) new URL(domain).openConnection();
            httpURLConnection.setRequestMethod("GET");

            httpURLConnection.setDoOutput(true);

            DataOutputStream wr = new DataOutputStream(httpURLConnection.getOutputStream());
            wr.writeBytes("data=" + data1);
            Log.i("url-webservice",data1);
            wr.flush();
            wr.close();

            InputStream in = httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(in);

            int inputStreamData = inputStreamReader.read();
            while (inputStreamData != -1) {
                char current = (char) inputStreamData;
                inputStreamData = inputStreamReader.read();
                data += current;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        return data;*/
        String response="";

        HttpClient client = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(domain);
        //HttpGet httpGet = new HttpGet(domain);
        try {
            Log.i("url-webservice",data1);
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
            nameValuePairs.add(new BasicNameValuePair("data", data1));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            // httpGet.setParams(params);
            HttpResponse execute = client.execute(httpPost);
            InputStream content = execute.getEntity().getContent();

            BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
            String s = "";
            while ((s = buffer.readLine()) != null) {
                response += s;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return response;
    }


    @Override
    protected void onPostExecute(String s) {
        Log.i("response",s);
        if(pd!=null){
            if(pd.isShowing()){pd.dismiss();}
        }
        try {
            JSONObject jobj=new JSONObject(s);
            listener.onAsyncTaskComplete(jobj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
