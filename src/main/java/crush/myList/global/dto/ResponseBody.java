package crush.myList.global.dto;

import org.springframework.http.HttpStatus;

public interface ResponseBody {
    HttpStatus getStatus();
    String getMessage();
}
