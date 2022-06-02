package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InitiatePaymentProcessResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-02T23:18:38.798271+02:00[Europe/Paris]")
public class InitiatePaymentProcessResponse   {
  final public static String STARTED = "started";

  @JsonProperty("status")
  private String status;

  @JsonProperty("since")
  private String since;

  public InitiatePaymentProcessResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", required = true)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InitiatePaymentProcessResponse since(String since) {
    this.since = since;
    return this;
  }

  /**
   * Get since
   * @return since
  */
  @NotNull 
  @Schema(name = "since", required = true)
  public String getSince() {
    return since;
  }

  public void setSince(String since) {
    this.since = since;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentProcessResponse initiatePaymentProcessResponse = (InitiatePaymentProcessResponse) o;
    return Objects.equals(this.status, initiatePaymentProcessResponse.status) &&
        Objects.equals(this.since, initiatePaymentProcessResponse.since);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, since);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentProcessResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

