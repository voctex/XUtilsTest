package com.voctex.xutilstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.voctex.xutilstest.bean.AddrListBean;
import com.voctex.xutilstest.bean.BaseBean;
import com.voctex.xutilstest.request.MyCallBack;
import com.voctex.xutilstest.request.XUtil;

import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.image.ImageOptions;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private String TEST_URL="http://gc.ditu.aliyun.com/regeocoding?l=39.938133,116.395739&type=001";
    private TextView showView;


    //接口请求返回值的内容为下
    /*{
    "queryLocation": [
            39.938133,
            116.395739
            ],
            "addrList": [
    {
        "type": "doorPlate",
            "status": 0,
            "name": "",
            "admCode": "",
            "admName": "",
            "nearestPoint": [],
        "distance": -1
    }
    ]
}*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showView= (TextView) findViewById(R.id.show_text);

        findViewById(R.id.request_get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                XUtil.Get(TEST_URL,new HashMap<String, String>(),new MyCallBack<BaseBean<Double,AddrListBean>>(){
                    @Override
                    public void onSuccess(BaseBean<Double, AddrListBean> result) {
                        super.onSuccess(result);
                        showView.setText("queryLocation="+result.getQueryLocation().get(0)+","+
                        result.getQueryLocation().get(1));
                    }

                    @Override
                    public void onError(Throwable ex, boolean isOnCallback) {
                        super.onError(ex, isOnCallback);
                        showView.setText("Throwable the exception is"+ex.getMessage());
                    }

                    @Override
                    public void onCancelled(CancelledException cex) {
                        super.onCancelled(cex);
                    }

                    @Override
                    public void onFinished() {
                        super.onFinished();
                    }
                });



            }
        });


        ImageOptions options=new ImageOptions.Builder()
                .setImageScaleType(ImageView.ScaleType.FIT_XY)
                .build();

        findViewById(R.id.request_post).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TEST_URL="http://open.zgzero.com/api/pad_push";

                HashMap<String,Object> hashMap=new HashMap<String, Object>();
                hashMap.put("msg","letmesee");
                hashMap.put("uid","w1");
                hashMap.put("wid","3e1d12a96d6326cf");
                hashMap.put("mid","17426");
                hashMap.put("pid","ecd4167cf829500a");


                XUtil.Post(TEST_URL,hashMap,new MyCallBack<String>(){
                    @Override
                    public void onSuccess(String result) {
                        super.onSuccess(result);
//                        showView.setText("status="+result.getAddrList().get(0).getStatus()+",type="+result.getAddrList().get(0).getType());
                        showView.setText("status="+result);
                    }

                    @Override
                    public void onError(Throwable ex, boolean isOnCallback) {
                        super.onError(ex, isOnCallback);
                        showView.setText("Throwable the exception is"+ex.getMessage());
                    }

                    @Override
                    public void onCancelled(CancelledException cex) {
                        super.onCancelled(cex);
                    }

                    @Override
                    public void onFinished() {
                        super.onFinished();
                    }
                });
            }
        });
    }
}
