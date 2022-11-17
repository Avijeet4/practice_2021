package companyInterviews;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.Data;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface FunctionalInterfaceTest{
    void print(String s);
}

enum CircuitState{
   OPEN("open") , CLOSE("close"), HALF_OPEN("half_open");
   String state;
   CircuitState(String state){
       this.state=state;
   }
}

public class CircuitBreaker {
    String state="closed";
    String instance;
    int threshold;
    int failedCnt=0;

    CircuitBreaker(String instance, int threshold){
        this.instance=instance;
        this.threshold=threshold;
    }

    String getState(String instance){
        return state;
    }

    public void failed(){
        failedCnt++;

    }

    public void recompute(){
        if(failedCnt<threshold){
            state="closed";
        }else{
            state="open";
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircuitBreaker that = (CircuitBreaker) o;
        return Objects.equals(instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance);
    }
}
