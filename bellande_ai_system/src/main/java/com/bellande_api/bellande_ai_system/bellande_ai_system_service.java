/**
 * Copyright (C) 2024 Bellande Application UI UX Research Innovation Center, Ronaldson Bellande
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 **/

package com.bellande_api.bellande_ai_system;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Bellande_Ai_System_Service {
    private final Bellande_Ai_System_Api bellande_ai_system_api;

    public Bellande_Ai_System_Service(String apiUrl, String endpointPath, String apiAccessKey) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl + endpointPath)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bellande_ai_system_api = retrofit.create(Bellande_Ai_System_Api.class);
    }

    public Call<Bellande_Ai_System_Api.BellandeResponse> getBellandeResponse(String inputText) {
        Bellande_Ai_System_Api.RequestBody requestBody = new Bellande_Ai_System_Api.RequestBody(inputText);
        return bellande_ai_system_api.getBellandeResponse(requestBody);
    }
}
