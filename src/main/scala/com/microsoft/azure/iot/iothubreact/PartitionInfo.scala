// Copyright (c) Microsoft. All rights reserved.

package com.microsoft.azure.iot.iothubreact

import java.time.Instant

/** Information about the partition where the message is stored
  *
  * @param partitionNumber    Partition number
  * @param lastSequenceNumber Sequence number of the last message in the partition
  * @param lastOffset         Offset of the last message in the partition
  * @param lastTimeUtc        UTC time of the last message in the partition
  */
class PartitionInfo(
    val partitionNumber: Option[Int],
    val lastSequenceNumber: Option[Long],
    val lastOffset: Option[String],
    val lastTimeUtc: Option[Instant])
