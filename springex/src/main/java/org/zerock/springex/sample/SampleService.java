package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor // final 추가 후 생성자 주입.
public class SampleService {

    //@Autowired (private SampleDAO sampleDAO;
    @Qualifier("normal")
    private final SampleDAO sampleDAO;
}
