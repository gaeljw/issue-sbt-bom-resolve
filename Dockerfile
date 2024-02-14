FROM eclipse-temurin:11-jdk-jammy

# Mandatory as sbt cannot run from /root anyway
WORKDIR /build

# Install sbt
ARG SBT_VERSION=1.9.8
RUN \
  curl -k -L -o sbt-$SBT_VERSION.deb https://repo.scala-sbt.org/scalasbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  rm -rf /var/lib/apt/lists/* && \
  sbt sbtVersion

COPY . .

RUN sbt compile -batch
