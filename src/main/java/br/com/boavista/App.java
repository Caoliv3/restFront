package br.com.boavista;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class App 
{
    public static void main( String[] args )
    {
        RestTemplate cliente = new RestTemplate();
        String endpoint = "http://localhost:8080/cliente/1";
        ResponseEntity<String> response = cliente.getForEntity(endpoint, String.class);

        System.out.println(response.getBody());
    }
}
