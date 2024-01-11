package kr.co.chunjae;


@SuppressWarnings("serial")
public class Example03Exception extends RuntimeException{

    private String errMsg;

    public Example03Exception() {
        this.errMsg = "Example03Exception 메세지입니다.";
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
