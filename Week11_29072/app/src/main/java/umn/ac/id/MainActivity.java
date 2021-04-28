package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPostsList;
    PostsAdapter adapter;
    Helper helper;

    ArrayList<PostModel> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPostsList = findViewById(R.id.rvPostsList);
        rvPostsList.setLayoutManager(new LinearLayoutManager(this));

        helper = ApiClient.getClient().create(Helper.class);

        getData();
    }

    public void getData(){
        Call<ArrayList<PostModel>> postsCallback = helper.getPosts();
        postsCallback.enqueue(new Callback<ArrayList<PostModel>>() {
            @Override
            public void onResponse(Call<ArrayList<PostModel>> call, Response<ArrayList<PostModel>> response) {
                posts = response.body();

                adapter = new PostsAdapter(posts);
                rvPostsList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<PostModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Internet not Available", Toast.LENGTH_LONG).show();
            }
        });
    }
}