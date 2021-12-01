package com.example.makeupshop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET("api/v1/products.json")
    Call<List<UserResponse>> getAllUsers();
}
