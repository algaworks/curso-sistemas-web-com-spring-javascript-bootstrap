SELECT v.data_criacao AS data_criacao
     , v.valor_total AS valor_total
     , c.nome AS nome_cliente
     , u.nome AS nome_vendedor
     , v.codigo AS codigo
 FROM venda v INNER JOIN cliente c ON v.codigo_cliente = c.codigo
    INNER JOIN usuario u ON v.codigo_usuario = u.codigo
 WHERE v.status = 'EMITIDA'
   AND v.data_criacao BETWEEN '2016-02-01 00:00:00' AND '2016-09-08 23:59:59'
 ORDER BY v.data_criacao ASC