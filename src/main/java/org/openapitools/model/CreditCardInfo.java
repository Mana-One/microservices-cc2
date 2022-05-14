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
 * CreditCardInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-14T23:00:37.861834+02:00[Europe/Paris]")
public class CreditCardInfo   {

  @JsonProperty("provider")
  private String provider;

  @JsonProperty("token")
  private String token;

  public CreditCardInfo provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  @NotNull 
  @Schema(name = "provider", required = true)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public CreditCardInfo token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  @NotNull 
  @Schema(name = "token", required = true)
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInfo creditCardInfo = (CreditCardInfo) o;
    return Objects.equals(this.provider, creditCardInfo.provider) &&
        Objects.equals(this.token, creditCardInfo.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInfo {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

