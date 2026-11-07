package Ejercicios.uped.com;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsultaApi {
    public static void main(String[] args) {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest peticion = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                .GET()
                .build();
        try {
            HttpResponse<String> respuesta =
                    cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo: " + respuesta.statusCode());
            System.out.println(respuesta.body());
        } catch (IOException e) {
            System.out.println("Fallo de red: " + e.getClass().getSimpleName());
        } catch (InterruptedException e) {
            System.out.println("Peticion interrumpida");
        }
    }
}