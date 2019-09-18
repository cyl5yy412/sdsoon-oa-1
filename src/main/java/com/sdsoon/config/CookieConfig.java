package com.sdsoon.config;

/**
 * Created By Chr on 2019/9/17.
 */
//@Configuration
public class CookieConfig {
/*
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        return (factory) -> factory.addContextCustomizers(
                //不以 . 开头的用这个
                (context) -> context.setCookieProcessor(new Rfc6265CookieProcessor()));
        //以 . 开头用这个 
        (context) -> context.setCookieProcessor(new LegacyCookieProcessor()));

    }*/

    /**
     * spring boot 2.0:
     * 在Spring Boot2.0以上配置嵌入式Servlet容器时EmbeddedServletContainerCustomizer类不存在，
     * 发现被WebServerFactoryCustomizer替代,一下为sp 1.x版本
     */
  /*  @Bean
    public EmbeddedServletContainerCustomizer cookieProcessorCustomizer() {
        return new EmbeddedServletContainerCustomizer() {

            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                if (container instanceof TomcatEmbeddedServletContainerFactory) {
                    ((TomcatEmbeddedServletContainerFactory) container)
                            .addContextCustomizers(new TomcatContextCustomizer() {

                                @Override
                                public void customize(Context context) {
                                    context.setCookieProcessor(new LegacyCookieProcessor());
                                }

                            });
                }
            }

        };
    }
    */

  // 2.x 版本
/*    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
//                factory.setPort(8081);
//                context.setCookieProcessor(new LegacyCookieProcessor());
            }
        };
    }*/



}
