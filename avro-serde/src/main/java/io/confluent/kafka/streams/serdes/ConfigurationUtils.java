/*
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.streams.serdes;

import java.util.HashMap;
import java.util.Map;

import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;

class ConfigurationUtils {

  /**
   * Enables the use of Specific Avro.
   *
   * @param config the serializer/deserializer/serde configuration
   * @return a copy of the configuration where the use of specific Avro is enabled
   */
  public static Map<String, Object> withSpecificAvroEnabled(final Map<String, ?> config) {
    Map<String, Object> specificAvroEnabledConfig =
        config == null ? new HashMap<String, Object>() : new HashMap<>(config);
    specificAvroEnabledConfig.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
    return specificAvroEnabledConfig;
  }

}