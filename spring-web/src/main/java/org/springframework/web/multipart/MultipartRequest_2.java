package org.springframework.web.multipart;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.lang.Nullable;
import org.springframework.util.MultiValueMap;

public interface MultipartRequest_2 {
    MultiValueMap<String, MultipartFile> getMultiFileMap();
}
