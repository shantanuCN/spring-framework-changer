package org.springframework.web.multipart;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.lang.Nullable;
import org.springframework.util.MultiValueMap;

public interface MultipartRequest_1 {
    @Nullable
    MultipartFile getFile(String name);

    List<MultipartFile> getFiles(String name);
}
