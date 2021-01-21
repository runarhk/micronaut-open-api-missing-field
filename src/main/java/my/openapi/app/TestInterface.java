package my.openapi.app;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(oneOf = {TestImpl1.class, TestImpl2.class})
public interface TestInterface {

    String getType();
}
