USE [dreamhome]
GO
BEGIN TRANSACTION
CREATE PARTITION SCHEME [maxRentScheme] AS PARTITION [maxRent] TO ([PRIMARY], [PRIMARY], [PRIMARY], [PRIMARY], [PRIMARY], [PRIMARY], [PRIMARY], [PRIMARY], [PRIMARY])






ALTER TABLE [dbo].[client] DROP CONSTRAINT [PK__client__819DA0AEFC4A68E1] WITH ( ONLINE = OFF )


SET ANSI_PADDING ON

ALTER TABLE [dbo].[client] ADD PRIMARY KEY NONCLUSTERED 
(
	[clientNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]


CREATE CLUSTERED INDEX [ClusteredIndex_on_maxRentScheme_637915928054140867] ON [dbo].[client]
(
	[maxRent]
)WITH (SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [maxRentScheme]([maxRent])


DROP INDEX [ClusteredIndex_on_maxRentScheme_637915928054140867] ON [dbo].[client]








COMMIT TRANSACTION



