package org.openapitools.api;

import org.openapitools.model.InitiatePaymentProcess;
import org.springframework.stereotype.Controller;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.Optional;
import javax.validation.Valid;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-14T23:00:37.861834+02:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.microservicesCC2.base-path:/v1}")
public class PaymentsApiController implements PaymentsApi {

    private final NativeWebRequest request;
    private final IdempotencyLayer idempotenceLayer;

    @Autowired
    public PaymentsApiController(
        NativeWebRequest request,
        IdempotencyLayer idempotenceLayer
    ) {
        this.request = request;
        this.idempotenceLayer = idempotenceLayer;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @RequestMapping(
        method = RequestMethod.POST,
        value = "/payments",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    @Override
    public ResponseEntity<Void> initiatePaymentProcess(
        @Parameter(name = "InitiatePaymentProcess", description = "Body of a request to start a payment process", required = true, schema = @Schema(description = "")) @Valid @RequestBody InitiatePaymentProcess initiatePaymentProcess
    ) {
        var check = idempotenceLayer.isStarted(initiatePaymentProcess);
        if (!check) {
            System.out.println("\nRedis miss !\n");
            // DO APP LOGIC HERE
            idempotenceLayer.addEntry(initiatePaymentProcess);
        } else {
            System.out.println("\nRedis hit !\n");
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
