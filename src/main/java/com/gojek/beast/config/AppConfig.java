package com.gojek.beast.config;

import org.aeonbits.owner.Config;

public interface AppConfig extends Config {
    @Key("CONSUMER_POLL_TIMEOUT_MS")
    @DefaultValue("9223372036854775807")
    Long getConsumerPollTimeoutMs();

    @Key("PROTO_COLUMN_MAPPING")
    @ConverterClass(ProtoIndexToFieldMapConverter.class)
    ColumnMapping getProtoColumnMapping();

    @Key("STENCIL_URL")
    String getStencilUrl();

    @Key("QUEUE_CAPACITY")
    @DefaultValue("20")
    Integer getQueueCapacity();

    @Key("BQ_WORKER_POLL_TIMEOUT_MS")
    @DefaultValue("50")
    Long getBqWorkerPollTimeoutMs();

    @Key("BQ_WORKER_POOL_SIZE")
    @DefaultValue("5")
    Integer getBqWorkerPoolSize();

    @Key("PROTO_SCHEMA")
    String getProtoSchema();

    @Key("BQ_TABLE_NAME")
    String getTable();

    @Key("BQ_DATASET_NAME")
    String getDataset();

    @Key("GOOGLE_CREDENTIALS")
    String getGoogleCredentials();

    @Key("KAFKA_CONSUMER_CONFIG_PREFIX")
    @DefaultValue("KAFKA_CONSUMER")
    String getKafkaConfigPrefix();

    @Key("KAFKA_TOPIC")
    String getKafkaTopic();

}