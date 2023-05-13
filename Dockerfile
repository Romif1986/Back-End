# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM amazoncorretto:17
maintainer romi_f1986
copy target/tp-0.0.1-SNAPSHOT.jar tp-0.0.1-SNAPSHOT.jar
entrypoint ["java","-jar","/tp-0.0.1-SNAPSHOT.jar"]


CMD ["/bin/sh"]
