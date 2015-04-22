# Gauge-Eclipse

Eclipse support for [Gauge](https://github.com/getgauge/gauge) project

This is an eclipse plugin that helps in authoring Java implementation of Gauge specs.

This plugin only supports [Java](../test_code/java.md).

## Versions supported

The plugin has been tested on  below versions of Eclipse
- 4.4 (Luna)
- 4.3.2 (Kepler SR2)

## Installation

This plugin depends on [XText](https://eclipse.org/Xtext/) 2.6 or newer. This plugin can be installed via an update-site.


Steps to install:

1) Click on Help -> Install New Software

2) Ensure that the below update sites are listed in the "Available Software Sites" list:

    1) XText : http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
    2) Gauge : https://dl.bintray.com/sriv/Gauge

3) In the Dialog that opens up, choose the Gauge update site (entered above) in the "Work with" textbox, press enter.

3) Eclipse should fetch and list the below

Category: `Gauge`
Feature: `Gauge Eclipse`

4) Select the `Gauge Eclipse` feature and Click "Next"

5) Confirm the installation of "Gauge Eclipse" by clicking "Next"

6) Accept the License terms, and Click "Finish".

Eclipse should then download and setup the plugin. This will require a restart of Eclipse.

## Developer notes

This plugin has been developed on top of [XText](https://eclipse.org/Xtext/) framework. In order to develop ensure that you use the [Eclipse Package for DSL](https://eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/lunasr2)

## License

Gauge-Eclipse is released under [Eclipse Public License version 1.0](https://www.eclipse.org/legal/epl-v10.html)

## Copyright

Copyright 2015 ThoughtWorks, Inc.
