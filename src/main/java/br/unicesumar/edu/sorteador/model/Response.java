package br.unicesumar.edu.sorteador.model;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class Response<T> {

    private Integer statusCode;

    private T data;

    private Date date;

    public Response() {
        this.date = new Date();
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
