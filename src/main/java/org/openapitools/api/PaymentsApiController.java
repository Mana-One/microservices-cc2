package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-14T20:02:41.255398+02:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.microservicesCC2.base-path:/v1}")
public class PaymentsApiController implements PaymentsApi {

    private final NativeWebRequest request;

    @Autowired
    public PaymentsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
