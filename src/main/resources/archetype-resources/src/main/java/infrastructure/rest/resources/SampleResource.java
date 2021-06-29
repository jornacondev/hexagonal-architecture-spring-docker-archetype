#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Delete this sample class
 */

@RestController
public class SampleResource {
    @GetMapping("/greeting")
    public String getCorrection() {
        return "Hello application";
    }
}
