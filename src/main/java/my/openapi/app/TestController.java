package my.openapi.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Maybe;

@Controller("/")
public class TestController {

    @Get
    public Maybe<TestInterface> hey() {
        return Maybe.empty();
    }

}
