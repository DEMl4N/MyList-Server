package crush.myList.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    InternalError(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 에러입니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "권한이 없습니다.");

    private final HttpStatus status;
    private final String message;
}
