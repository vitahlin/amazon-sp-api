# amazon-sp-api

The Java SDK for amazon-sp-api

```shell

# FBA Inbound API
java -jar ./swagger-codegen-cli-2.4.43.jar generate -i ./selling-partner-api-models/models/fba-inbound-eligibility-api-model/fbaInbound.json -l java -t ./selling-partner-api-models/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates -o  /Users/vitah/dev/amazon-sp-api

# FBA Inventory API
java -jar ./swagger-codegen-cli-2.4.43.jar generate -i ./selling-partner-api-models/models/fba-inventory-api-model/fbaInventory.json -l java -t ./selling-partner-api-models/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates -o  /Users/vitah/dev/amazon-sp-api

# Finance API
java -jar ./swagger-codegen-cli-2.4.43.jar generate -i ./selling-partner-api-models/models/finances-api-model/finances_2024-06-19.json -l java -t ./selling-partner-api-models/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates -o  /Users/vitah/dev/amazon-sp-api

# Fulfillment Inbound API
java -jar ./swagger-codegen-cli-2.4.43.jar generate -i ./selling-partner-api-models/models/fulfillment-inbound-api-model/fulfillmentInbound_2024-03-20.json -l java -t ./selling-partner-api-models/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates -o  /Users/vitah/dev/amazon-sp-api

```
