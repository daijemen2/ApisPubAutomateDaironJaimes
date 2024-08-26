# bbog-eco-api-automated-testing

Este proyecto se enfoca en la automatización de las APIs.

Se ha desarrollado específicamente para evaluar el flujo de E-commerce mediante el uso de RestAssured.
***

## 🏠 Detalles del Tester.


* Name: `Stefania Cupitra Reyes`
* Usuario: `scupitr@bancodebogota.com.co`
* Country: `Colombia`
* City: `Bogotá`
* LinkedIn: [www.linkedin.com/in/stefaniacupitrareyes](www.linkedin.com/in/stefaniacupitrareyes)

***

## 🛠️ Lenguajes & Frameworks

En este proyecto, se emplean los siguientes lenguajes y frameworks:

* [Maven](https://maven.apache.org/guides/) Es una herramienta de software utilizada para la gestión y construcción de proyectos Java.

* [Java 17](https://docs.oracle.com/en/java/javase/17/) como lenguaje de programación.

* [Rest Assured](https://rest-assured.io/) como lenguaje frameworks.

***

### 🚀 Pruebas de Integración continua

> Con GitHub Actions, puedes crear flujos de trabajo de integración continua (IC) directamente en tu repositorio de
> GitHub.

Para este proyecto, se utiliza GitHub Actions como herramienta para la integración continua del framework de automatización desarrollado.


La ruta de los pipelines reusables se encuentra en: `.github/workflows/test-integration.yml` y `.github/workflows/requirements.yml`


| develop                                  | status                                                                                                                                                                                                                                                   |
|------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Integración de pruebas automatizadas** | [![automated-testing-integration](https://github.com/bancodebogota/bbog-eco-api-testing//actions/workflows/test-integration.yml/badge.svg?branch=master)](https://github.com/bancodebogota/bbog-eco-api-testing//actions/workflows/test-integration.yml) |
| **Proyecto de requisitos**               | [![requirements-project](https://github.com/bancodebogota/bbog-eco-api-testing//actions/workflows/requirements.yml/badge.svg?branch=staging)](https://github.com/bancodebogota/bbog-eco-api-testing//actions/workflows/requirements.yml)                 |


**📄️ Generando los reportes de prueba**:
Con la ejecución de los pipelines se generará un artefacto llamado `reports`, donde se alojarán los informes con los resultados de esa ejecución.

***

### 🧪 Apis contempladas

> - [x] [validateWidgetPreRenderV2] 
> - [x] [validateWidgetPostRenderV2] 
> - [x] [dispatcherRequest] 
> - [x] [transactionalCcRequest] 
> - [x] [transactionalTcRequest] 
> - [x] [transactionStatusTC] 
> - [x] [internalProxy] 
> - [x] [sendEventPentagono] 
> - [x] [transactionalEventDataManagement] 
> - [x] [getAppSyncApiCredentials] 
> - [x] [creditCardFirstWindowRequest] 

***

## ▶️ Ejecución del proyecto:

1. Clonar el proyecto desde GitHub a tu directorio local.
    * **Opción 1** (HTTPS): `https://github.com/bancodebogota/bbog-eco-automated-testing.git`
    * **Opción 2** (SSH): `git@github.com:bancodebogota/bbog-eco-automated-testing.git`

***

2. Descargar e instalar Maven, luego configurarlo.
3. Descargar e instalar TestNG y configurarlo.
4. Descargar las dependencias necesarias.
    * Las encontrara en el `./pom.xml`.

***

5. Ejecutar las pruebas desde `./Recorder.java`.

***

## 📄 Generación de informes

Los informes detallados con los pasos y resultados de las pruebas se registrarán en las rutas:

`./results`

***



