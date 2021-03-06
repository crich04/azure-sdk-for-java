/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiProducts.
 */
public class ApiProductsInner {
    /** The Retrofit service to perform REST calls. */
    private ApiProductsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of ApiProductsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApiProductsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(ApiProductsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiProducts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiProductsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.ApiProducts listByApis" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/apis/{apiId}/products")
        Observable<Response<ResponseBody>> listByApis(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("apiId") String apiId, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$skip") Integer skip, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.ApiProducts listByApisNext" })
        @GET
        Observable<Response<ResponseBody>> listByApisNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProductContractInner&gt; object if successful.
     */
    public PagedList<ProductContractInner> listByApis(final String resourceGroupName, final String serviceName, final String apiId) {
        ServiceResponse<Page<ProductContractInner>> response = listByApisSinglePageAsync(resourceGroupName, serviceName, apiId).toBlocking().single();
        return new PagedList<ProductContractInner>(response.body()) {
            @Override
            public Page<ProductContractInner> nextPage(String nextPageLink) {
                return listByApisNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProductContractInner>> listByApisAsync(final String resourceGroupName, final String serviceName, final String apiId, final ListOperationCallback<ProductContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByApisSinglePageAsync(resourceGroupName, serviceName, apiId),
            new Func1<String, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(String nextPageLink) {
                    return listByApisNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProductContractInner&gt; object
     */
    public Observable<Page<ProductContractInner>> listByApisAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        return listByApisWithServiceResponseAsync(resourceGroupName, serviceName, apiId)
            .map(new Func1<ServiceResponse<Page<ProductContractInner>>, Page<ProductContractInner>>() {
                @Override
                public Page<ProductContractInner> call(ServiceResponse<Page<ProductContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProductContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProductContractInner>>> listByApisWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        return listByApisSinglePageAsync(resourceGroupName, serviceName, apiId)
            .concatMap(new Func1<ServiceResponse<Page<ProductContractInner>>, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(ServiceResponse<Page<ProductContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByApisNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProductContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProductContractInner>>> listByApisSinglePageAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (apiId == null) {
            throw new IllegalArgumentException("Parameter apiId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final Integer top = null;
        final Integer skip = null;
        return service.listByApis(resourceGroupName, serviceName, apiId, this.client.subscriptionId(), filter, top, skip, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProductContractInner>> result = listByApisDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProductContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProductContractInner&gt; object if successful.
     */
    public PagedList<ProductContractInner> listByApis(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip) {
        ServiceResponse<Page<ProductContractInner>> response = listByApisSinglePageAsync(resourceGroupName, serviceName, apiId, filter, top, skip).toBlocking().single();
        return new PagedList<ProductContractInner>(response.body()) {
            @Override
            public Page<ProductContractInner> nextPage(String nextPageLink) {
                return listByApisNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProductContractInner>> listByApisAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip, final ListOperationCallback<ProductContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByApisSinglePageAsync(resourceGroupName, serviceName, apiId, filter, top, skip),
            new Func1<String, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(String nextPageLink) {
                    return listByApisNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProductContractInner&gt; object
     */
    public Observable<Page<ProductContractInner>> listByApisAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip) {
        return listByApisWithServiceResponseAsync(resourceGroupName, serviceName, apiId, filter, top, skip)
            .map(new Func1<ServiceResponse<Page<ProductContractInner>>, Page<ProductContractInner>>() {
                @Override
                public Page<ProductContractInner> call(ServiceResponse<Page<ProductContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProductContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProductContractInner>>> listByApisWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip) {
        return listByApisSinglePageAsync(resourceGroupName, serviceName, apiId, filter, top, skip)
            .concatMap(new Func1<ServiceResponse<Page<ProductContractInner>>, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(ServiceResponse<Page<ProductContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByApisNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
    ServiceResponse<PageImpl<ProductContractInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<ProductContractInner>> * @param serviceName The name of the API Management service.
    ServiceResponse<PageImpl<ProductContractInner>> * @param apiId API identifier. Must be unique in the current API Management service instance.
    ServiceResponse<PageImpl<ProductContractInner>> * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
    ServiceResponse<PageImpl<ProductContractInner>> * @param top Number of records to return.
    ServiceResponse<PageImpl<ProductContractInner>> * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProductContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProductContractInner>>> listByApisSinglePageAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (apiId == null) {
            throw new IllegalArgumentException("Parameter apiId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByApis(resourceGroupName, serviceName, apiId, this.client.subscriptionId(), filter, top, skip, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProductContractInner>> result = listByApisDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProductContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProductContractInner>> listByApisDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProductContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProductContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProductContractInner&gt; object if successful.
     */
    public PagedList<ProductContractInner> listByApisNext(final String nextPageLink) {
        ServiceResponse<Page<ProductContractInner>> response = listByApisNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ProductContractInner>(response.body()) {
            @Override
            public Page<ProductContractInner> nextPage(String nextPageLink) {
                return listByApisNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProductContractInner>> listByApisNextAsync(final String nextPageLink, final ServiceFuture<List<ProductContractInner>> serviceFuture, final ListOperationCallback<ProductContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByApisNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(String nextPageLink) {
                    return listByApisNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProductContractInner&gt; object
     */
    public Observable<Page<ProductContractInner>> listByApisNextAsync(final String nextPageLink) {
        return listByApisNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ProductContractInner>>, Page<ProductContractInner>>() {
                @Override
                public Page<ProductContractInner> call(ServiceResponse<Page<ProductContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProductContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProductContractInner>>> listByApisNextWithServiceResponseAsync(final String nextPageLink) {
        return listByApisNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ProductContractInner>>, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(ServiceResponse<Page<ProductContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByApisNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all Products, which the API is part of.
     *
    ServiceResponse<PageImpl<ProductContractInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProductContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProductContractInner>>> listByApisNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByApisNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProductContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProductContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProductContractInner>> result = listByApisNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProductContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProductContractInner>> listByApisNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProductContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProductContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
