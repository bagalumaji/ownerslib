package com.bagal.config;

import com.bagal.convertors.StringToBrowserTypeConvertor;
import com.bagal.enums.BrowserTypes;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.*;

import java.util.List;

@LoadPolicy(LoadType.MERGE)
@Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/configs/config.properties"
})
public interface FrameworkConfig extends Config {

    String url();

    @DefaultValue("chrome")
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserTypes browser();

    @DefaultValue("15")
    @Key("explicitTimeout")
    long explicitTimeout();

    List<String> names();
}
