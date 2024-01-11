package kr.co.chunjae;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "찾을 수 없습니다.-김재우")
public class Example02Exception extends Exception {

    public Example02Exception(String message) {
        System.out.println(message);
    }
}
