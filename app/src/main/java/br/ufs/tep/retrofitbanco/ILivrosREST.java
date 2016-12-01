package br.ufs.tep.retrofitbanco;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by ammenendez on 28/09/16.
 */

public interface ILivrosREST {

    @POST("Livros/webresources/br.ufs.tep.livros/inserir")
    Call<Void> insereLivro(@Body Livro livro);

    @GET("Livros/webresources/br.ufs.tep.livros")
    Call<List<Livro>> getLivros();

    @GET("Livros/webresources/br.ufs.tep.livros/buscar/{id}")
    Call<Livro> getLivroPorId(@Path("id") String id);

    @PUT("Livros/webresources/br.ufs.tep.livros/editar/{id}")
    Call<Void> alteraLivro(@Path("id") String id, @Body Livro livro);

    @DELETE("Livros/webresources/br.ufs.tep.livros/remover/{id}")
    Call<Void> removeLivro(@Path("id") String id);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
