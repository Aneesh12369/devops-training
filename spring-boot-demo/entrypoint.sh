#!/bin/sh
echo "starting the app!!!!!"
echo "JAVA OPTS $JAVA_OPTS"
echo "args ${@}"
exec java ${JAVA_OPTS} -jar app.jar ${@}
