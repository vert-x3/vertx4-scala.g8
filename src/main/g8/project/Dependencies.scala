import sbt._

object Version {
  final val Scala       = "2.13.2"
  final val ScalaTest   = "3.1.2"
  final val Vertx       = "4.0.0-SNAPSHOT"
}

object Library {
  val vertx_codegen                     = "io.vertx" %  "vertx-codegen"                     % Version.Vertx % "provided"
  val vertx_lang_scala                  = "io.vertx" %% "vertx-lang-scala"                  % Version.Vertx changing()

  val vertx_amqp_bridge                 = "io.vertx" %% "vertx-amqp-bridge-scala"           % Version.Vertx changing()
  val vertx_auth_common                 = "io.vertx" %% "vertx-auth-common-scala"           % Version.Vertx changing()
  val vertx_auth_htdigest               = "io.vertx" %% "vertx-auth-htdigest-scala"         % Version.Vertx changing()
  val vertx_auth_htpasswd               = "io.vertx" %% "vertx-auth-htpasswd-scala"         % Version.Vertx changing()
  val vertx_auth_jdbc                   = "io.vertx" %% "vertx-auth-jdbc-scala"             % Version.Vertx changing()
  val vertx_auth_jwt                    = "io.vertx" %% "vertx-auth-jwt-scala"              % Version.Vertx changing()
  val vertx_auth_ldap                   = "io.vertx" %% "vertx-auth-ldap-scala"             % Version.Vertx changing()
  val vertx_auth_mongo                  = "io.vertx" %% "vertx-auth-mongo-scala"            % Version.Vertx changing()
  val vertx_auth_oauth2                 = "io.vertx" %% "vertx-auth-oauth2-scala"           % Version.Vertx changing()
  val vertx_auth_properties             = "io.vertx" %% "vertx-auth-properties-scala"       % Version.Vertx changing()
  val vertx_auth_shiro                  = "io.vertx" %% "vertx-auth-shiro-scala"            % Version.Vertx changing()
  val vertx_auth_sql                    = "io.vertx" %% "vertx-auth-sql-scala"              % Version.Vertx changing()
  val vertx_auth_webauthn               = "io.vertx" %% "vertx-auth-webauthn-scala"         % Version.Vertx changing()
  val vertx_bridge_common               = "io.vertx" %% "vertx-bridge-common-scala"         % Version.Vertx changing()
  val vertx_circuit_breaker             = "io.vertx" %% "vertx-circuit-breaker-scala"       % Version.Vertx changing()
  val vertx_config                      = "io.vertx" %% "vertx-config-scala"                % Version.Vertx changing()
  val vertx_consul_client               = "io.vertx" %% "vertx-consul-client-scala"         % Version.Vertx changing()
  val vertx_dropwizard_metrics          = "io.vertx" %% "vertx-dropwizard-metrics-scala"    % Version.Vertx changing()
  val vertx_jdbc_client                 = "io.vertx" %% "vertx-jdbc-client-scala"           % Version.Vertx changing()
  val vertx_jwt                         = "io.vertx" %% "vertx-jwt-scala"                   % Version.Vertx changing()
  val vertx_kafka_client                = "io.vertx" %% "vertx-kafka-client-scala"          % Version.Vertx changing()
  val vertx_mail_client                 = "io.vertx" %% "vertx-mail-client-scala"           % Version.Vertx changing()
  val vertx_mongo_client                = "io.vertx" %% "vertx-mongo-client-scala"          % Version.Vertx changing()
  val vertx_mqtt                        = "io.vertx" %% "vertx-mqtt-scala"                  % Version.Vertx changing()
  val vertx_mssql_client                = "io.vertx" %% "vertx-mssql-client-scala"          % Version.Vertx changing()
  val vertx_mysql_client                = "io.vertx" %% "vertx-mysql-client-scala"          % Version.Vertx changing()
  val vertx_pg_client                   = "io.vertx" %% "vertx-pg-client-scala"             % Version.Vertx changing()
  val vertx_proton                      = "io.vertx" %% "vertx-proton-scala"                % Version.Vertx changing()
  val vertx_rabbitmq_client             = "io.vertx" %% "vertx-rabbitmq-client-scala"       % Version.Vertx changing()
  val vertx_redis_client                = "io.vertx" %% "vertx-redis-client-scala"          % Version.Vertx changing()
  val vertx_service_discovery           = "io.vertx" %% "vertx-service-discovery-scala"     % Version.Vertx changing()
  val vertx_shell                       = "io.vertx" %% "vertx-shell-scala"                 % Version.Vertx changing()
  val vertx_sql_client                  = "io.vertx" %% "vertx-sql-client-scala"            % Version.Vertx changing()
  val vertx_stomp                       = "io.vertx" %% "vertx-stomp-scala"                 % Version.Vertx changing()
  val vertx_tcp_eventbus_bridge         = "io.vertx" %% "vertx-tcp-eventbus-bridge-scala"   % Version.Vertx changing()
  val vertx_web_client                  = "io.vertx" %% "vertx-web-client-scala"            % Version.Vertx changing()
  val vertx_web_common                  = "io.vertx" %% "vertx-web-common-scala"            % Version.Vertx changing()
  val vertx_web_templ_freemarker        = "io.vertx" %% "vertx-web-templ-freemarker-scala"  % Version.Vertx changing()
  val vertx_web_templ_handlebars        = "io.vertx" %% "vertx-web-templ-handlebars-scala"  % Version.Vertx changing()
  val vertx_web_templ_jade              = "io.vertx" %% "vertx-web-templ-jade-scala"        % Version.Vertx changing()
  val vertx_web_templ_mvel              = "io.vertx" %% "vertx-web-templ-mvel-scala"        % Version.Vertx changing()
  val vertx_web_templ_pebble            = "io.vertx" %% "vertx-web-templ-pebble-scala"      % Version.Vertx changing()
  val vertx_web_templ_thymeleaf         = "io.vertx" %% "vertx-web-templ-thymeleaf-scala"   % Version.Vertx changing()
  val vertx_web                         = "io.vertx" %% "vertx-web-scala"                   % Version.Vertx changing()

  //non-vert.x deps
  val scalaTest                         = "org.scalatest" %% "scalatest" % Version.ScalaTest
}
