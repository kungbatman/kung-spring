package cn.kung.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author kung
 * @Date 2022-06-03
 **/
public interface Resource {
    InputStream getInputStream() throws IOException;
}
